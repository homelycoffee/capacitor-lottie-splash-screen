package com.getlocal.plugins.caplss;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "CapacitorLottieSplashScreen")
public class CapacitorLottieSplashScreenPlugin extends Plugin {

    private CapacitorLottieSplashScreen implementation = new CapacitorLottieSplashScreen();

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }
}
