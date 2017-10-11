/*
 * @author:Mr.NieWang
 * */
function Delete(id)
{
	if(confirm("确定要删除吗？Are you sure to delete this?")) {
		location.href = "user-delete.html?id=" + id;
	}
}


