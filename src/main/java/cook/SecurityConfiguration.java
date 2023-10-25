/*
 * Copyright 2017-Present the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cook;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@Profile("development")
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests().anyRequest().permitAll()
                .and()
                .httpBasic().disable()
                .csrf().disable()
                .build()
                .antMatchers("/api/v1/session/**",
                             "/swagger-ui/**",
                             "/api/swagger-ui/**",
                             "/v3/api-docs/**",
                             "/actuator/**",
                             "/readyz",
                             "/livez",
                             "/dev/**").permitAll()
                .anyRequest().authenticated();

    // public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    //     http.sessionManagement()
    //             .sessionCreationPolicy(SessionCreationPolicy.NEVER)
    //         .and().authorizeRequests()
    //             .antMatchers("/api/v1/session/**",
    //                          "/swagger-ui/**",
    //                          "/api/swagger-ui/**",
    //                          "/v3/api-docs/**",
    //                          "/actuator/**",
    //                          "/readyz",
    //                          "/livez",
    //                          "/dev/**").permitAll()
    //             .anyRequest().authenticated();

    }
}


