package org.schema.api.model.thing.product;

public class ProductModel extends Product
{
	private ProductModel isVariantOf;
	private ProductModel predecessorOf;
	private ProductModel successorOf;

	public ProductModel getIsVariantOf()
	{
		return isVariantOf;
	}

	public void setIsVariantOf(ProductModel isVariantOf)
	{
		this.isVariantOf = isVariantOf;
	}

	public ProductModel getPredecessorOf()
	{
		return predecessorOf;
	}

	public void setPredecessorOf(ProductModel predecessorOf)
	{
		this.predecessorOf = predecessorOf;
	}

	public ProductModel getSuccessorOf()
	{
		return successorOf;
	}

	public void setSuccessorOf(ProductModel successorOf)
	{
		this.successorOf = successorOf;
	}
}