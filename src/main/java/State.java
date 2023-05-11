
public abstract class State {

	Player player;

	public State(Player player) {
		this.player = player;
	}

	public abstract String clickPlay();

	public abstract String clickNext();

	public abstract String clickLock();

	public abstract String clickPrevious();

}
