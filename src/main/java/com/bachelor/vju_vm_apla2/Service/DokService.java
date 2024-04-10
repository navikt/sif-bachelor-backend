package com.bachelor.vju_vm_apla2.Service;

import com.bachelor.vju_vm_apla2.Models.POJO.Dokarkiv.Dokumenter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

@Service
public class DokService {
    private static final Logger logger = LogManager.getLogger(SimpleService.class);

    private final WebClient webClient;
    @Value("${wiremock.combined}")
    private String url;
    //setter opp HTTP syntax slik at vi kan gjøre kall på serverere (Serevere er erstattet med Wiremock)
    public DokService() {
        this.webClient = WebClient.builder()
                .baseUrl(url)
                .build();
    }
    
    //------------------------------------------------------------------------------------
    //public Mono<String>
    public Mono<String>hentDokument(){
        return Mono.just("aaaa");
    }
//    private static List<byte[]> tobyteArray(Dokumenter [] fysiskdok){
//
//        for (Object o : Arrays.stream(fysiskdok).toArray()) {
//
//        }
//
//
//    }
}
