
public class Player {
	public State state ;
	public String msg ;
	
	
	
	public Player(State state, String msg) {
		super();
		this.state = state;
		this.msg = msg;
	}
	

	public Player() {
		super();
		this.state = new ReadyState(this);
	}


	public Player changeState(State s) {
		return s.player;
	}
	
	public String SetCurrrentState(State s) {
		return s.player.msg;
	}
	
	public String stop() {
		return "Stopped";
	}
	
	public String pause() {
		return "Paused";
	}
	public State getState() {
		return state;
	}


	public void setState(State state) {
		this.state = state;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public String start() {
		return "playing";
	}
	
	public String next() {
		return "next track";
	}
	
	public String previous() {
		return "previous track";
	}
	
	

}
