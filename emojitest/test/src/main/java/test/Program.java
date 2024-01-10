package test;

import java.util.Set;

import net.fellbaum.jemoji.Emoji;
import net.fellbaum.jemoji.EmojiManager;

public class Program {

	public static void main(String[] args) {
		Set<Emoji> emojis = EmojiManager.getAllEmojis();
		System.out.println(emojis.size());
	}
}
