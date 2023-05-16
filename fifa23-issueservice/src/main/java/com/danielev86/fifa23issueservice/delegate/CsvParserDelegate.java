package com.danielev86.fifa23issueservice.delegate;

import com.danielev86.fifa23issueservice.rest.bean.PlayerIssueDTO;
import com.danielev86.fifa23issueservice.rest.bean.TeamIssueDTO;
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

    public List<TeamIssueDTO> findFinancialIssues(){
        List<TeamIssueDTO> financials = null;
        try(Reader reader = Files.newBufferedReader(PathHelper.fileFinancialIssuerPath())) {
            CsvToBean<TeamIssueDTO> csvToBean = new CsvToBeanBuilder<TeamIssueDTO>(reader)
                    .withType(TeamIssueDTO.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            financials = csvToBean.parse();
        } catch (IOException|URISyntaxException e) {
            logger.error("Error while reading csv file", e);
        }
        return financials;
    }

    public List<PlayerIssueDTO> findPlayerIssues(){
        List<PlayerIssueDTO> players = null;
        try(Reader reader = Files.newBufferedReader(PathHelper.filePlayerIssuerPath())) {
            CsvToBean<PlayerIssueDTO> csvToBean = new CsvToBeanBuilder<PlayerIssueDTO>(reader)
                    .withType(PlayerIssueDTO.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            players = csvToBean.parse();
        } catch (IOException|URISyntaxException e) {
            logger.error("Error while reading csv file", e);
        }
        return players;
    }

}



