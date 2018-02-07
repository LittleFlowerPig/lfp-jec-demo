package com.lfp.jec.service.log;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.config.client.ConfigClientProperties;
import org.springframework.core.env.Environment;

/**
 * Project: jec-service-log
 * Title:
 * Description:
 * Date: 07
 * Copyright: Copyright (c) 2018
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
@ConfigurationProperties(ConfigClientProperties.PREFIX)
public class MyConfigClientProperties extends ConfigClientProperties {

    public MyConfigClientProperties(Environment environment) {
        super(environment);
    }

    public ConfigClientProperties override(org.springframework.core.env.Environment environment) {
        ConfigClientProperties override = super.override(environment);
        if (environment.containsProperty(ConfigClientProperties.PREFIX + ".uri")) {
            override.setUri(
                    environment.getProperty(ConfigClientProperties.PREFIX + ".uri"));
        }
        return override;
    }

}
