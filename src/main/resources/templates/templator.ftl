<#import "parts/common.ftl" as c>
<@c.page>
<form action="#" method="post" enctype="multipart/form-data">
    <div class="form-row">
        <label class="col-md-2 col-form-label">Field name:</label>
        <div class="col-md-4">
            <input type="text" name="fieldName" class="form-control" placeholder="Field name"/>
        </div>
        <label class="col-md-2" for="documentName">Document:</label>
        <div class="form-group col-md-4">
            <select type="text" name="document" id="documentName" class="form-control"/>
        </div>
        <input type="file" name="file"/>
        <input type="hidden" name="_csrf" value="${_csrf.token}"/>
        <br><br>
    </div>
    <button type="button" class="btn btn-outline-primary btn-lg mr-4">Add new field</button>
    <button type="submit" class="btn btn-success ">Create template</button>


</form>

</@c.page>