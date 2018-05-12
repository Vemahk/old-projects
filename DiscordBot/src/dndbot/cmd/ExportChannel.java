package dndbot.cmd;

import net.dv8tion.jda.core.Permission;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import dndbot.Main;

public class ExportChannel implements Command {

	public ExportChannel() {}
	
	public void run(String[] args, MessageReceivedEvent event) {
		Main.respondTimeout("Debug; Received! (NOTE: ~exportchannel currently does nothing. It is still a Work in Progress.)", 5, event);
	}
	
	public boolean hasPermissions(MessageReceivedEvent event) {
		if(event.getMember().hasPermission(Permission.ADMINISTRATOR)) return true;
		return false;
	}
}