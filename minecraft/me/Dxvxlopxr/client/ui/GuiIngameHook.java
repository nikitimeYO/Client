package me.Dxvxlopxr.client.ui;

import me.Dxvxlopxr.client.Client;
import me.Dxvxlopxr.client.hack.Hack;
import me.Dxvxlopxr.client.utils.Wrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;

public class GuiIngameHook extends GuiIngame{

	public GuiIngameHook(Minecraft mcIn) {
		super(mcIn);
	}
	public void func_175180_a(float p_175180_1_){
		super.func_175180_a(p_175180_1_);
		Wrapper.fr.drawString(Client.Client_Name + " | Version:" + Client.Client_Version, 1, 1, 0xffffffff);
		renderArrayList();
	}
	private void renderArrayList() {
		int yCount = 9;
		for(Hack h : Client.client.hackManager.enabledHacks){
			h.onRender();
			if(h.getState()){
				Wrapper.fr.drawString(h.getName(), 2, yCount, 0x00ff7f);
				yCount = yCount + yCount;
			}
		}
	}
}
