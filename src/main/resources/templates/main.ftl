<#import "parts/common.ftl" as c>
<@c.page>
    <p class="h1 text-primary">Список загруженных шаблонов</p>
        <#list documents as document>
<div>
                <b>${document.docId}</b>
                <b>${document.docName}</b>
                <b><a href="/documents/${document.docId}">Choose</a></b>
</div>
            <#else>
            No documents!
        </#list>

</@c.page>