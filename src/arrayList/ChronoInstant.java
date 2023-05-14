package arrayList;

/**
 * This class records series of times collected during a process 
 *
 * @author agutierr et marianne huchard pour Instant
 */
import java.time.Duration;
import java.time.Instant;

/**
 * This class records series of times collected during a process 
 *
 * @author agutierr et marianne huchard pour startInstant et stopInstant
 */


import java.util.ArrayList;
import java.util.HashMap;

public class ChronoInstant {
	private String name;
	private boolean nano;
	protected HashMap<String,Instant> current_chronos=new HashMap<>();
	protected HashMap<String,ArrayList<Duration>> results=new HashMap<>();
	public ChronoInstant(String name,boolean nano)
	{
		this.name=name;
		this.nano=nano;
	}
	public ChronoInstant(String name)
	{
		this(name,false);
	}
	public String getName()
	{
		return name;
	}

	public void startInstant(String serieName)
	{
		current_chronos.put(serieName, Instant.now());
	}
	public void stopInstant(String serieName)
	{
		Instant currentTime=current_chronos.get(serieName);
		if(currentTime!=null) 
			{
			ArrayList<Duration>result=results.get(serieName);
			if(result==null)
			{
				result=new ArrayList<>();
				results.put(serieName, result);
			}
			result.add(Duration.between(currentTime,Instant.now()));
			}
	}
	public long getResult(String serieName)
	{
		long l=0L;
		for(Duration mesure:results.get(serieName)) l+=mesure.toNanos();
		return l/1_000_000L; 
	}
	public ArrayList<Duration> getResultArray(String serieName)
	{
		return results.get(serieName);
	}
	public long getResult()
	{
		long l=0L;
		for(ArrayList<Duration> mesures:results.values())
			for(Duration mesure:mesures) l+=mesure.toNanos();
		return l/1_000_000L;
	}
	public int getSerieCount()
	{
		return results.size();
	}
	public String[] getSerieNames()
	{
		return results.keySet().toArray(new String[results.keySet().size()]);
	}
}
