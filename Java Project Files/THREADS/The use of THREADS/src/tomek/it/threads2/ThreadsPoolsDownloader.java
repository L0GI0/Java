package tomek.it.threads2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadsPoolsDownloader {

	
	private class Downloader implements Runnable {
		private final URL url;

		public Downloader(URL url) {
			this.url = url;
		}

		private String readAll(Reader reader) throws IOException {
			StringBuilder builder = new StringBuilder();
			int read = 0;
			while ((read = reader.read()) != -1) {
				builder.append((char) read);
			}
			return builder.toString();
		}

		@Override
		public void run() {
			try {
				Reader reader = null;
				try {
					reader = new BufferedReader(new InputStreamReader(url.openStream()));
					String result = readAll(reader);
					System.out.printf("Read %d characters from %10s\n", result.length(), url);
				} finally {
					if (reader != null)
						reader.close();
				}
			} catch (IOException e) {
				System.err.println(e);
			}
		}
	}

	
	
	public void runIt(String[] addresses) throws MalformedURLException {
		BlockingQueue<Runnable> runnables = new ArrayBlockingQueue<Runnable>(1024);
		ThreadPoolExecutor executor = new ThreadPoolExecutor(8, 16, 60, TimeUnit.SECONDS, runnables);
		
		System.out.println("Following web pages number will be downloaded: " + addresses.length);

		for (String s : addresses)
			executor.submit(new Downloader(new URL(s)));

		executor.shutdown();
	}


	
	public static void main(String[] args) {

		String[] addresses = {
				"http://lyngsat.com",
				"http://google.com",
				"http://www.agh.edu.pl",
				"http://www.apple.com/",
				"http://www.cyfraplus.pl",
				"http://www.gazeta.pl",
				"http://www.youtube.com/",
				"http://en.wikipedia.org",
				"http://www.skyscanner.pl",
				"http://www.possic.de/",
				"http://www.contorsion.com/",
				"http://limbermen.com/",
				"http://meltingpot.fortunecity.com/belgium/256/",
				"http://www.solarman.bird.to/contortion",
				"http://www.solarman.bird.to/new.html",
				"http://blog.goo.ne.jp/k6gp/",
				"http://www.microsoft.com",
				"http://www.experts-exchange.com/Web_Development/Web_Languages-Standards/XML/Q_20250616.html",
				"http://web.me.com/tomek.orzechowski/Bazy",
				"http://www.aeroflot.ru",
				"http://www1.tricolor.tv",
				"http://nasze.bieszczady.pl",
				"http://nasza.bialowieza.pl",
				"http://www.w3.org/",
				"http://maps.google.com/",
				"http://www.amazon.com",
				"http://www.manning.com",
				"http://www.oreilly.com",
				"http://forums.macrumors.com",
				"http://www.dziennik.pl",
				"http://www.oracle.com",
				"http://www.wp.pl",
				"http://www.mail.ru",
				"http://www.polets.ru",
				"http://bazy.tomek.it",
				"http://www.whatsmyip.org/http_compression/",
				"http://www.onet.pl",
				"http://www.ovh.pl",
				"http://indect-project.eu",
				"http://www.eurotv.com",
				"http://Stardeveloper.com",
				"http://david.fullrecall.com/website-optimization",
				"http://stackoverflow.com",
				"http://www.javadocexamples.com/java_source/net/sf/jazzlib/ZipFile.java.html",
				"http://david.fullrecall.com",
				"http://www.shrinkrays.net/code-snippets/csharp/gzip-and-deflate-page-compression-in-asp-net.aspx",
				"http://stackoverflow.com/questions/3017711/apache-deflate-does-it-wait-for-the-whole-page-to-load-first",
				"http://www.orangecoat.com/smaller-and-faster-web-pages-with-gzip-deflate-and-apache",
				"http://support.sas.com/documentation/cdl/en/lrdict/64316/HTML/default/viewer.htm" };

		ThreadsPoolsDownloader programme = new ThreadsPoolsDownloader();
		try {
			programme.runIt(addresses);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}
}
