package lib.enderwizards.sandstone.mod.config;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import org.github.trainerguy22.jtoml.impl.Toml;


/**
 * A helper class for parsing TOML and vanilla-style config files.
 * 
 * @author TheMike
 */
public class Configuration {

	public static ConfigImpl toml(File file) {
		try {
			file.createNewFile();
			return new ConfigImpl(file, Toml.parse(file));
		} catch (IOException e) { e.printStackTrace(); }
		return null;
	}
	
}
