package rover;

public class Rover {
	private Position position;
	private Direction direction;
	
	public Rover(Position position, Direction direction)
	{
		this.position = position;
		this.direction = direction;
	}
	
	public Rover(Integer x, Integer y, Direction direction)
	{
		this(new Position(x, y), direction);
	}
	
	public Rover()
	{
		this(new Position(0, 0), Direction.NORTH);
	}
	
	public String toString()
	{
		return " is actually : \n" + "Position [x=" + this.position.getx() + ", y=" + this.position.gety() + "] \n" + this.direction;
	}
}
