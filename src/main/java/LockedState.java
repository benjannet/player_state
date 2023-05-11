
public  class LockedState extends State {

	public LockedState(Player player) {
		super(player);
		// TODO Auto-generated constructor stub
	}


	@Override
	public  String clickPlay() {
		player.changeState(new PlayingState(player));
		//player.SetCurrrentState();
		return player.start();
		//return "Pause" ;
	}
	@Override
	public String clickNext() {
		return "locked";
	}
	
	@Override
	public String clickLock() {
		//player.changeState(new LockedState(player));
		return"locked";
	}

	@Override
	public String clickPrevious() {
		return"locked";
	}
}
