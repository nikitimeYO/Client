package me.Dxvxlopxr.client.hack;

import java.util.ArrayList;

import me.Dxvxlopxr.client.hacks.*;

public class HackManager {
	public static ArrayList<Hack> enabledHacks = new ArrayList<Hack>();
	public HackManager(){
		this.enabledHacks.add(new Sprint());
		this.enabledHacks.add(new FullBright());
	}
}
