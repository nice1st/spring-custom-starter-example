package cyh.example.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties(prefix = "cyh")
@Data
public class CyhProperties {
    String name;
}
