package insurance;

/**
 * @author 박지수
 * @version 1.0
 * @created 11-5-2020 오후 9:35:36
 */
public interface insuranceList {

	public boolean add(boolean waitList, insurance insurance);

	public boolean delete(boolean waitList, insurance insurance);

	public boolean modify(insurance insurance);

}