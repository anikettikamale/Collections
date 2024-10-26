package collection.listclasses;

//public class Amazon implements Comparable<Amazon>
//{
//int amazonProdId;
//String amazonProdName;
//int status;
//Amazon(int amazonProdId, String amazonProdName)
//{
//	this.amazonProdId=amazonProdId;
//	this.amazonProdName=amazonProdName;
//}  public int compareTo(Amazon a) {
//		if(amazonProdId==a.amazonProdId)
//		{
//			status=0;
//		}
//		else if(amazonProdId>a.amazonProdId)
//		{
//			status=1;
//		}
//		else if(amazonProdId<a.amazonProdId)
//		{
//			status=-1;
//		}
//		return status;
//	}}

public class Amazon implements Comparable<Amazon>
{
int amazonProdId;
String amazonProdName;
int status;
Amazon(int amazonProdId, String amazonProdName)
{
	this.amazonProdId=amazonProdId;
	this.amazonProdName=amazonProdName;
}  public int compareTo(Amazon a) {
	return amazonProdName.compareTo(a.amazonProdName);
}}
