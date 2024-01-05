package com.stempien.CenyZlotaApiProxy;



import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
    public class ApiHelper {
        public String response;
        public int cena;
        public ApiHelper() {
            try {
                String apiUrl = "https://api.nbp.pl/api/cenyzlota";
                URL url = new URL(apiUrl);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                int responseCode = connection.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    BufferedReader reader = new BufferedReader(
                            new InputStreamReader(connection.getInputStream()));
                    String line;
                    StringBuilder response = new StringBuilder();
                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }
                    this.response = String.valueOf(response);
                    reader.close();
                    connection.disconnect();
                }
                } catch(ProtocolException e){
                    throw new RuntimeException(e);
                } catch(MalformedURLException e){
                    throw new RuntimeException(e);
                } catch(IOException e){
                    throw new RuntimeException(e);
                }
        }
        public ApiHelper(String link) {
            try {
                String apiUrl = link;
                URL url = new URL(apiUrl);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                int responseCode = connection.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    BufferedReader reader = new BufferedReader(
                            new InputStreamReader(connection.getInputStream()));
                    String line;
                    StringBuilder response = new StringBuilder();
                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }
                    this.response = String.valueOf(response);
                    reader.close();
                    connection.disconnect();
                }
            } catch(ProtocolException e){
                throw new RuntimeException(e);
            } catch(MalformedURLException e){
                throw new RuntimeException(e);
            } catch(IOException e){
                throw new RuntimeException(e);
            }
        }
        }
