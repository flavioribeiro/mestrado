package projects.stable_leader_election.nodes.messages;

import sinalgo.nodes.messages.Message;

/**
 * The Messages that are sent by the S1Nodes in the Sample1 projects. They contain one int
 * as payload.
 */
public class SimpleMessage extends Message {
	/**
	 * The payload of the S1Message.
	 */
	public int data;
	
	/**
	 * Constructs a new Message of type S1Message.
	 *
	 * @param data
	 */
	public SimpleMessage(int data) {
		this.data = data;
	}

	@Override
	public Message clone() {
		return new S1Message(data);
	}

}
