class movie 
{
	String movieName;
	String hero;
	String heroine;

	public void displayMovieInfo()
	{
		System.out.println("movieName = " + this.movieName + " hero = " + this.hero + " heroine = " + this.heroine);
	}

	public movie(String movieName,String hero,String heroine)
	{
		this.movieName=movieName;
		this.hero=hero;
		this.heroine=heroine;
	}

	public static void main(String[] args) 
	{
		movie m1=new movie("Kranthi","Dharshan","Rachitha");
		movie m2=new movie("Leo","Vijay","Thrisha");
		movie m3=new movie("Galipata","Ganesh","Daizy");
		m1.displayMovieInfo();
		m2.displayMovieInfo();
		m3.displayMovieInfo();

	}
}
