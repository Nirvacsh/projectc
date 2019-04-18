<#import "parts/common.ftl" as c>
<@c.page>
    <form action="/uploadDocument" method="post" enctype="multipart/form-data">
    <div class="form-group row">
    <input type="file" name="file"/>
    <input type="hidden" name="_csrf" value="${_csrf.token}"/>
    <br><br>
    <button type="submit" class="btn btn-success ">Go to templator</button>

</@c.page>