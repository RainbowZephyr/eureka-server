package com.github.eureka.config

import org.apache.catalina.connector.Connector
import org.apache.coyote.http11.Http11NioProtocol
import org.apache.coyote.http2.Http2Protocol
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory
import org.springframework.boot.web.server.WebServerFactoryCustomizer
import org.springframework.context.annotation.Configuration

@Configuration
class TomcatConfig : WebServerFactoryCustomizer<TomcatServletWebServerFactory> {
    override fun customize(factory: TomcatServletWebServerFactory) {
        factory.addConnectorCustomizers(
            { connector: Connector ->
                // Ensure that NIO connector is used
                val protocol: Http11NioProtocol = connector.protocolHandler as Http11NioProtocol
                connector.addUpgradeProtocol(Http2Protocol())
            },
        )
    }
}
