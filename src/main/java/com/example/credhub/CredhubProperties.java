package com.example.credhub;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Configuration
@ConfigurationProperties("vcap.services.mycredhub.credentials") //add the name of your PCF service here to replace "mycredhub"
public class CredhubProperties {
    public String mysecretkey; //add whatever properties you need in here that are stored in CredHub
}