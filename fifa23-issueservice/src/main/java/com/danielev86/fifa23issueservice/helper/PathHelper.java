package com.danielev86.fifa23issueservice.helper;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathHelper {

    public static Path filePlayerIssuerPath() throws URISyntaxException {
        URI uri = ClassLoader.getSystemResource("templates/csv/fifa23_injury_player_issues.csv").toURI();
        return Paths.get(uri);
    }

    public static Path fileFinancialIssuerPath() throws URISyntaxException {
        URI uri = ClassLoader.getSystemResource("templates/csv/fifa23_financial_team_issues.csv").toURI();
        return Paths.get(uri);
    }

    public static Path fileTransfermarketPath() throws URISyntaxException {
        URI uri = ClassLoader.getSystemResource("templates/csv/fifa23_transfermarket_issues.csv").toURI();
        return Paths.get(uri);
    }

}
