package com.mobanisto.odftoolkit.website;

import java.io.IOException;
import java.nio.file.Path;

import de.topobyte.system.utils.SystemPaths;

public class TestGenerateWebsite
{

	public static void main(String[] args) throws IOException
	{
		Path repo = SystemPaths.HOME.resolve("github/sebkur/odftoolkit");

		WebsiteGenerator websiteGenerator = new WebsiteGenerator(repo, repo,
				SystemPaths.HOME.resolve("github/sebkur/odftoolkit-gh-pages"));
		websiteGenerator.generate();
	}

}
