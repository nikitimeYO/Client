package me.Dxvxlopxr.client.hacks;

import org.lwjgl.input.Keyboard;

import me.Dxvxlopxr.client.hack.Category;
import me.Dxvxlopxr.client.hack.Hack;
import me.Dxvxlopxr.client.utils.Wrapper;

public class FullBright extends Hack{

	public FullBright() {
		super("FullBright", Keyboard.KEY_C, Category.RENDER);
	}
	public void onTick(){
		if(this.getState()){
			Wrapper.mc.gameSettings.gammaSetting = 10.0f;
		}else{
			Wrapper.mc.gameSettings.gammaSetting = 1.0f;
		}
	}
}
