<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>

<@c.page>
Registration page
${message?ifExists}
<@l.login "/registration"/>

</@c.page>