package cuberite.plugin;

import cuberite.api.cGlobals;
import cuberite.api.hooks.HookManager;
import lua.plugin.LuaPluginSupport;
import net.minestom.server.MinecraftServer;
import net.minestom.server.extensions.Extension;

public class EntryPoint extends Extension {
	@Override 
	public void preInitialize() {
		// Get extension
		LuaPluginSupport extension = (LuaPluginSupport) MinecraftServer.getExtensionManager().getExtension("LuaPluginSupport");
		
		// Add API to plugins
		extension.addAPI((plugin) -> {cGlobals.initialize(plugin, plugin.globals);});
	}
	
	@Override
	public void initialize() {
		// Register hooks
		HookManager.registerHooks();
	}
	
	@Override
	public void terminate() {
		// TODO Auto-generated method stub
		
	}

}
