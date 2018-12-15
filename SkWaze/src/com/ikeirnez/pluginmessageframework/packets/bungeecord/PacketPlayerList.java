package com.ikeirnez.pluginmessageframework.packets.bungeecord;

import com.ikeirnez.pluginmessageframework.PacketWriter;
import com.ikeirnez.pluginmessageframework.RawPacket;

import java.io.IOException;

/**
 * Created by iKeirNez on 01/01/14.
 */
public class PacketPlayerList extends RawPacket {

    public String server;

    public PacketPlayerList(String server){
        super("BungeeCord");
        this.server = server;
    }

    @Override
    public PacketWriter write() throws IOException {
        PacketWriter packetWriter = new PacketWriter(this);
        packetWriter.writeUTF("PlayerList");
        packetWriter.writeUTF(server);
        return packetWriter;
    }
}
