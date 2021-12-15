package org.iesfm.airline;

import org.springframework.web.client.RestTemplate;

import javax.swing.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();

        restTemplate.postForLocation(
                "http://172.16.0.43:8080/flights",
                new Flight("otro2", "Barcelona", "Madrid")
        );

        Flight[] flights = restTemplate.getForObject(
                "http://172.16.0.43:8080/flights",
                Flight[].class
        );


        String flightsString = "";
        for(Flight flight: flights) {
            flightsString += flight.getFlightNumber() + "\n";
        }
        JFrame frame = new JFrame("Aerolínea");
        JPanel panel = new JPanel();
        JTextArea label = new JTextArea();

        label.setText(flightsString);
        panel.add(
                label
        );
        frame.add(panel);
        frame.setVisible(true);
        frame.setBounds(0, 0, 600, 600);
    }
}
