package SOAP_API_Testing;

import org.apache.http.HttpResponse;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.*;

public class SOAP_Request_Test {

    String endpoint = "http://www.webservicex.net/medicareSupplier.asmx";

    @Test
    public void getSoapResponse() throws IOException
    {
        File requestFile = new File("C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\test\\java\\SOAP_API_Testing\\RequestsSource\\SOAP_Request_Example_1");

        HttpClient client = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(endpoint);

        post.setEntity(new InputStreamEntity(new FileInputStream(requestFile)));
        post.setHeader("Content-type","text/xml");

        HttpResponse response = client.execute(post);

        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println(statusCode);
        Assert.assertEquals(statusCode, 200); //?????????????

    }
}