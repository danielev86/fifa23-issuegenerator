package com.danielev86.fifa23issueservice.delegate;

import com.danielev86.fifa23issueservice.rest.bean.PlayerDTO;
import com.danielev86.fifa23issueservice.rest.bean.TeamDTO;
import com.danielev86.fifa23issueservice.helper.PathHelper;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.util.List;

@Component
public class CsvParserDelegate {

    private static final Logger logger = LoggerFactory.getLogger(CsvParserDelegate.class);

    public List<TeamDTO> findFinancialIssues(){
        List<TeamDTO> financials = null;
        try(Reader reader = Files.newBufferedReader(PathHelper.fileFinancialIssuerPath())) {
            CsvToBean<TeamDTO> csvToBean = new CsvToBeanBuilder<TeamDTO>(reader)
                    .withType(TeamDTO.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            financials = csvToBean.parse();
        } catch (IOException|URISyntaxException e) {
            logger.error("Error while reading csv file", e);
        }
        return financials;
    }

    public List<PlayerDTO> findPlayerIssues(){
        List<PlayerDTO> players = null;
        try(Reader reader = Files.newBufferedReader(PathHelper.filePlayerIssuerPath())) {
            CsvToBean<PlayerDTO> csvToBean = new CsvToBeanBuilder<PlayerDTO>(reader)
                    .withType(PlayerDTO.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            players = csvToBean.parse();
        } catch (IOException|URISyntaxException e) {
            logger.error("Error while reading csv file", e);
        }
        return players;
    }

}



