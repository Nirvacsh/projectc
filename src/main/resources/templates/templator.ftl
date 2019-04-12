<#import "parts/common.ftl" as c>
<@c.page>
<form action="#" method="post" enctype="multipart/form-data">
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">Field name:</label>
        <div class="col-sm-6">
            <input type="text" name="username" class="form-control" placeholder="Field name"/>
        </div>
        <input type="hidden" name="_csrf" value="${_csrf.token}"/>
        <br><br>
    <button type="button" class="btn btn-outline-primary btn-lg mr-4">Add new field</button>
    <button type="submit" class="btn btn-success ">Create template</button>
        <input type="file" name="file"/>
        <label>File to upload<input type="submit" value="Upload"></label>

</form>

</@c.page>