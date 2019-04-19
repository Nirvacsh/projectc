<#import "parts/common.ftl" as c>
<@c.page>
<form action="#" method="post" enctype="multipart/form-data">
    <div class="form-row">
        <label class="col-md-1 col-form-label" for="fieldN">Field name:</label>
        <div class="col-md-5">
            <input type="text" name="fieldName" id="fieldN" class="form-control" placeholder="Field name"/>
        </div>
        <label class="col-md-1 col-form-label" for="documentN">Document:</label>
        <div class="col-md-5">
            <select name="document" id="documentN" class="form-control" placeholder="Document"/>
            <option selected>Choose one</option>
            <option>....</option>
        </div>
<#--        <label for="documentName">DocName</label>-->
<#--        <div class="form-group col-md-4">-->
<#--            <select name="document" id="documentName" class="form-control"/>-->
<#--            <option selected> Choose...</option>-->
<#--            <option><#list documents as document>-->
<#--                    <div>-->
<#--                        <b>${document.docId}</b>-->
<#--                        <b>${document.docName}</b>-->
<#--                    </div>-->
<#--                <#else>-->
<#--                    No documents!-->
<#--                </#list></option>-->
<#--        </div>-->

        <input type="hidden" name="_csrf" value="${_csrf.token}"/>
        <br><br>
    </div>
    <button type="button" class="btn btn-outline-primary btn-lg mr-4">Add new field</button>
    <button type="submit" class="btn btn-success ">Create template</button>


</form>
</@c.page>