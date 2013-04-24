package sound;

import sound.graphics.Window;
import sound.midiPlayer.MidiPlayer;

public class Main {
	public static void main(String[] args) {
		Window w = new Window(new MidiPlayer());
	}
}
