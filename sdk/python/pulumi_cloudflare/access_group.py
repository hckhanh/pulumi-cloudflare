# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['AccessGroup']


class AccessGroup(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 excludes: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['AccessGroupExcludeArgs']]]]] = None,
                 includes: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['AccessGroupIncludeArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 requires: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['AccessGroupRequireArgs']]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Cloudflare Access Group resource. Access Groups are used
        in conjunction with Access Policies to restrict access to a
        particular resource based on group membership.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        # Allowing access to `test@example.com` email address only
        test_group_access_group = cloudflare.AccessGroup("testGroupAccessGroup",
            account_id="975ecf5a45e3bcb680dba0722a420ad9",
            name="staging group",
            includes=[cloudflare.AccessGroupIncludeArgs(
                emails=["test@example.com"],
            )])
        # Allowing `test@example.com` to access but only when coming from a
        # specific IP.
        test_group_index_access_group_access_group = cloudflare.AccessGroup("testGroupIndex/accessGroupAccessGroup",
            account_id="975ecf5a45e3bcb680dba0722a420ad9",
            name="staging group",
            includes=[cloudflare.AccessGroupIncludeArgs(
                emails=["test@example.com"],
            )],
            requires={
                "ips": [var["office_ip"]],
            })
        ```
        ## Conditions

        `require`, `exclude` and `include` arguments share the available
        conditions which can be applied. The conditions are:

        * `ip` - (Optional) A list of IP addresses or ranges. Example:
        `ip = ["1.2.3.4", "10.0.0.0/2"]`
        * `email` - (Optional) A list of email addresses. Example:
        `email = ["test@example.com"]`
        * `email_domain` - (Optional) A list of email domains. Example:
        `email_domain = ["example.com"]`
        * `service_token` - (Optional) A list of service token ids. Example:
        `service_token = [cloudflare_access_service_token.demo.id]`
        * `any_valid_service_token` - (Optional) Boolean indicating if allow
        all tokens to be granted. Example: `any_valid_service_token = true`
        * `group` - (Optional) A list of access group ids. Example:
        `group = [cloudflare_access_group.demo.id]`
        * `everyone` - (Optional) Boolean indicating permitting access for all
        requests. Example: `everyone = true`
        * `certificate` - (Optional) Whether to use mTLS certificate authentication.
        * `common_name` - (Optional) Use a certificate common name to authenticate with.
        * `gsuite` - (Optional) Use GSuite as the authentication mechanism. Example:
        * `github` - (Optional) Use a GitHub team as the `include` condition. Example:
        * `azure` - (Optional) Use Azure AD as the `include` condition. Example:
        * `okta` - (Optional) Use Okta as the `include` condition. Example:
        * `saml` - (Optional) Use an external SAML setup as the `include` condition.
        Example:

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The ID of the account the group is
               associated with.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['AccessGroupExcludeArgs']]]] excludes: A series of access conditions, see below for
               full list.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['AccessGroupIncludeArgs']]]] includes: A series of access conditions, see below for
               full list.
        :param pulumi.Input[str] name: Friendly name of the Access Group.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['AccessGroupRequireArgs']]]] requires: A series of access conditions, see below for
               full list.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if account_id is None:
                raise TypeError("Missing required property 'account_id'")
            __props__['account_id'] = account_id
            __props__['excludes'] = excludes
            if includes is None:
                raise TypeError("Missing required property 'includes'")
            __props__['includes'] = includes
            if name is None:
                raise TypeError("Missing required property 'name'")
            __props__['name'] = name
            __props__['requires'] = requires
        super(AccessGroup, __self__).__init__(
            'cloudflare:index/accessGroup:AccessGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            excludes: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['AccessGroupExcludeArgs']]]]] = None,
            includes: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['AccessGroupIncludeArgs']]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            requires: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['AccessGroupRequireArgs']]]]] = None) -> 'AccessGroup':
        """
        Get an existing AccessGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The ID of the account the group is
               associated with.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['AccessGroupExcludeArgs']]]] excludes: A series of access conditions, see below for
               full list.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['AccessGroupIncludeArgs']]]] includes: A series of access conditions, see below for
               full list.
        :param pulumi.Input[str] name: Friendly name of the Access Group.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['AccessGroupRequireArgs']]]] requires: A series of access conditions, see below for
               full list.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["account_id"] = account_id
        __props__["excludes"] = excludes
        __props__["includes"] = includes
        __props__["name"] = name
        __props__["requires"] = requires
        return AccessGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> str:
        """
        The ID of the account the group is
        associated with.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def excludes(self) -> Optional[List['outputs.AccessGroupExclude']]:
        """
        A series of access conditions, see below for
        full list.
        """
        return pulumi.get(self, "excludes")

    @property
    @pulumi.getter
    def includes(self) -> List['outputs.AccessGroupInclude']:
        """
        A series of access conditions, see below for
        full list.
        """
        return pulumi.get(self, "includes")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Friendly name of the Access Group.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def requires(self) -> Optional[List['outputs.AccessGroupRequire']]:
        """
        A series of access conditions, see below for
        full list.
        """
        return pulumi.get(self, "requires")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

