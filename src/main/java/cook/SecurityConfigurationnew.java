

package cook;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;


// @Configuration
// @Profile("development")
// // @EnableWebSecurity

// public class SecurityConfigurationnew {

//     @Bean
//     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//          http.sessionManagement()
//                 .sessionCreationPolicy(SessionCreationPolicy.NEVER)
//             .and().authorizeHttpRequests() 
//                 .requestMatchers("/api/v1/session/**",
//                              "/swagger-ui/**",
//                              "/api/swagger-ui/**",
//                              "/v3/api-docs/**",
//                              "/actuator/**",
//                              "/readyz",
//                              "/livez",
//                              "/dev/**").permitAll()
//                 .anyRequest().authenticated();
//         return null;

//     }
// }
