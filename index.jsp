
<!DOCTYPE html>
<html><head><title>Login Page</title></head><body>
  <h2>Login</h2>
  <form action="LoginServlet" method="post">
    Username: <input type="text" name="username" /><br>
    Password: <input type="password" name="password" /><br>
    Role:
    <select name="role">
      <option value="admin">Admin</option>
      <option value="vendor">Vendor</option>
      <option value="manager">Delivery Manager</option>
    </select><br>
    <input type="submit" value="Login" />
  </form>
</body></html>
