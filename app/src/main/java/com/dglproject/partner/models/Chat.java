package com.dglproject.partner.models;
import com.google.firebase.database.IgnoreExtraProperties;
/**
 * Created by Tortuvshin Byambaa on 3/10/2017.
 */
@IgnoreExtraProperties
public class Chat {
    public String sender;
    public String receiver;
    public String senderUid;
    public String receiverUid;
    public String message;
    public long timestamp;

    public Chat() {
    }

    public Chat(String sender, String receiver, String senderUid, String receiverUid, String message, long timestamp) {
        this.sender = sender;
        this.receiver = receiver;
        this.senderUid = senderUid;
        this.receiverUid = receiverUid;
        this.message = message;
        this.timestamp = timestamp;
    }
}