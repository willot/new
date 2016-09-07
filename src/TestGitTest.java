import junit.framework.TestCase;


public class TestGitTest extends TestCase {
	
	public void testWord() {
		
		TestGit testGit = new TestGit();
		assertEquals("blabla", testGit.word());
	}

}
