package sound;

import sound.midiPlayer.MidiPlayer;
import sound.graphics.Window;

public class Main {
	public static void main(String[] args) {
		Window w = new Window(new MidiPlayer());
	}
}
