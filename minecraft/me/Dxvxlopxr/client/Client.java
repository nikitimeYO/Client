package me.Dxvxlopxr.client;

import org.lwjgl.opengl.Display;

import me.Dxvxlopxr.client.hack.HackManager;

public class Client {
	public static String Client_Name = "Client";
	public static double Client_Version = 1.0;
	
	public static HackManager hackManager;
	
	public static final Client client = new Client();
	public static void initiateClient(){
		hackManager = new HackManager();
		Display.setTitle("Client | V:1.0");
	}
	public String getClient_Name() {
		return Client_Name;
	}
	public void setClient_Name(String client_Name) {
		Client_Name = client_Name;
	}
	public double getClient_Version() {
		return Client_Version;
	}
	public void setClient_Version(double client_Version) {
		Client_Version = client_Version;
	}
}
