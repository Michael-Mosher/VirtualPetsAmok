package org.wecancodeit.virtualpetsamok;

abstract class AbstractCageDnaVP extends AbstractDnaVP
{
	abstract public void cleanCage();
	
	public AbstractVirtualPet getPet()
	{
		return this.oVpDecoration.getPet();
	}
}
