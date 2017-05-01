package me.Dxvxlopxr.client.hacks;

import org.lwjgl.input.Keyboard;

import me.Dxvxlopxr.client.hack.Category;
import me.Dxvxlopxr.client.hack.Hack;
import me.Dxvxlopxr.client.utils.Wrapper;

public class Sprint extends Hack{

	public Sprint() {
		super("Auto Sprint", Keyboard.KEY_Z, Category.PLAYER);
	}
	public void onTick(){
		if(!this.getState())
			return;
		if(!(Wrapper.mc.thePlayer.isCollidedHorizontally) && Wrapper.mc.thePlayer.moveForward > 0.0f){
			Wrapper.mc.thePlayer.setSprinting(true);
		}else{
			Wrapper.mc.thePlayer.setSprinting(false);
		}
	}
}
