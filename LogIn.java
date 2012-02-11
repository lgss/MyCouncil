package uk.gov.selfserve;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.client.Stub;

public class LogIn
{
	public boolean success = false;
	public Stub stub;
	public EngineConfiguration config;

	public void setSuccess(boolean success)
	{
		this.success = success;
	}
	public void setStub(Stub stub)
	{
		this.stub = stub;
	}
	public void setConfig(EngineConfiguration config)
	{
		this.config = config;
	}
	public boolean getSuccess()
	{
		return success;
	}
	public Stub getStub()
	{
		return stub;
	}
	public EngineConfiguration getConfig()
	{
		return config;
	}
}