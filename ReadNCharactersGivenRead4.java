
public class ReadNCharactersGivenRead4 {
	/**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return    The number of characters read
     */
    public int read(char[] buf, int n) {
        int bufEnd = 0;
        char[] temp = new char[4];
        while(bufEnd < n) {
        	int read = read4(temp);
        	for(int i = 0; i < read && bufEnd < n; i++) {
        		buf[bufEnd++] = temp[i];
        	}
        	if(read < 4) {
        		break;
        	}
        }
        return bufEnd;
    }

	private int read4(char[] temp) {
		// TODO Auto-generated method stub
		return 0;
	}
}
