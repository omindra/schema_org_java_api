package org.schema.api.model.thing.creativeWork.book;

import org.schema.api.model.thing.creativeWork.CreativeWork;
import org.schema.api.model.thing.intangible.enumeration.BookFormatType;
import org.schema.api.model.thing.Person;

public class Book extends CreativeWork
{
	private Boolean abridged;
	private String bookEdition;
	private BookFormatType bookFormat;
	private Person illustrator;
	private String isbn;
	private Integer numberOfPages;

	public Boolean getAbridged()
	{
		return abridged;
	}

	public void setAbridged(Boolean abridged)
	{
		this.abridged = abridged;
	}

	public String getBookEdition()
	{
		return bookEdition;
	}

	public void setBookEdition(String bookEdition)
	{
		this.bookEdition = bookEdition;
	}

	public BookFormatType getBookFormat()
	{
		return bookFormat;
	}

	public void setBookFormat(BookFormatType bookFormat)
	{
		this.bookFormat = bookFormat;
	}

	public Person getIllustrator()
	{
		return illustrator;
	}

	public void setIllustrator(Person illustrator)
	{
		this.illustrator = illustrator;
	}

	public String getIsbn()
	{
		return isbn;
	}

	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}

	public Integer getNumberOfPages()
	{
		return numberOfPages;
	}

	public void setNumberOfPages(Integer numberOfPages)
	{
		this.numberOfPages = numberOfPages;
	}
}