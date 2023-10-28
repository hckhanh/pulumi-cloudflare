# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['WorkerScriptArgs', 'WorkerScript']

@pulumi.input_type
class WorkerScriptArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 content: pulumi.Input[str],
                 name: pulumi.Input[str],
                 analytics_engine_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptAnalyticsEngineBindingArgs']]]] = None,
                 compatibility_date: Optional[pulumi.Input[str]] = None,
                 compatibility_flags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 kv_namespace_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptKvNamespaceBindingArgs']]]] = None,
                 logpush: Optional[pulumi.Input[bool]] = None,
                 module: Optional[pulumi.Input[bool]] = None,
                 plain_text_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptPlainTextBindingArgs']]]] = None,
                 queue_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptQueueBindingArgs']]]] = None,
                 r2_bucket_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptR2BucketBindingArgs']]]] = None,
                 secret_text_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptSecretTextBindingArgs']]]] = None,
                 service_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptServiceBindingArgs']]]] = None,
                 webassembly_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptWebassemblyBindingArgs']]]] = None):
        """
        The set of arguments for constructing a WorkerScript resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] content: The script content.
        :param pulumi.Input[str] name: The global variable for the binding in your Worker code.
        :param pulumi.Input[str] compatibility_date: The date to use for the compatibility flag.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] compatibility_flags: Compatibility flags used for Worker Scripts.
        :param pulumi.Input[bool] logpush: Enabling allows Worker events to be sent to a defined Logpush destination.
        :param pulumi.Input[bool] module: The base64 encoded wasm module you want to store.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "content", content)
        pulumi.set(__self__, "name", name)
        if analytics_engine_bindings is not None:
            pulumi.set(__self__, "analytics_engine_bindings", analytics_engine_bindings)
        if compatibility_date is not None:
            pulumi.set(__self__, "compatibility_date", compatibility_date)
        if compatibility_flags is not None:
            pulumi.set(__self__, "compatibility_flags", compatibility_flags)
        if kv_namespace_bindings is not None:
            pulumi.set(__self__, "kv_namespace_bindings", kv_namespace_bindings)
        if logpush is not None:
            pulumi.set(__self__, "logpush", logpush)
        if module is not None:
            pulumi.set(__self__, "module", module)
        if plain_text_bindings is not None:
            pulumi.set(__self__, "plain_text_bindings", plain_text_bindings)
        if queue_bindings is not None:
            pulumi.set(__self__, "queue_bindings", queue_bindings)
        if r2_bucket_bindings is not None:
            pulumi.set(__self__, "r2_bucket_bindings", r2_bucket_bindings)
        if secret_text_bindings is not None:
            pulumi.set(__self__, "secret_text_bindings", secret_text_bindings)
        if service_bindings is not None:
            pulumi.set(__self__, "service_bindings", service_bindings)
        if webassembly_bindings is not None:
            pulumi.set(__self__, "webassembly_bindings", webassembly_bindings)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def content(self) -> pulumi.Input[str]:
        """
        The script content.
        """
        return pulumi.get(self, "content")

    @content.setter
    def content(self, value: pulumi.Input[str]):
        pulumi.set(self, "content", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        The global variable for the binding in your Worker code.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="analyticsEngineBindings")
    def analytics_engine_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptAnalyticsEngineBindingArgs']]]]:
        return pulumi.get(self, "analytics_engine_bindings")

    @analytics_engine_bindings.setter
    def analytics_engine_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptAnalyticsEngineBindingArgs']]]]):
        pulumi.set(self, "analytics_engine_bindings", value)

    @property
    @pulumi.getter(name="compatibilityDate")
    def compatibility_date(self) -> Optional[pulumi.Input[str]]:
        """
        The date to use for the compatibility flag.
        """
        return pulumi.get(self, "compatibility_date")

    @compatibility_date.setter
    def compatibility_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "compatibility_date", value)

    @property
    @pulumi.getter(name="compatibilityFlags")
    def compatibility_flags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Compatibility flags used for Worker Scripts.
        """
        return pulumi.get(self, "compatibility_flags")

    @compatibility_flags.setter
    def compatibility_flags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "compatibility_flags", value)

    @property
    @pulumi.getter(name="kvNamespaceBindings")
    def kv_namespace_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptKvNamespaceBindingArgs']]]]:
        return pulumi.get(self, "kv_namespace_bindings")

    @kv_namespace_bindings.setter
    def kv_namespace_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptKvNamespaceBindingArgs']]]]):
        pulumi.set(self, "kv_namespace_bindings", value)

    @property
    @pulumi.getter
    def logpush(self) -> Optional[pulumi.Input[bool]]:
        """
        Enabling allows Worker events to be sent to a defined Logpush destination.
        """
        return pulumi.get(self, "logpush")

    @logpush.setter
    def logpush(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "logpush", value)

    @property
    @pulumi.getter
    def module(self) -> Optional[pulumi.Input[bool]]:
        """
        The base64 encoded wasm module you want to store.
        """
        return pulumi.get(self, "module")

    @module.setter
    def module(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "module", value)

    @property
    @pulumi.getter(name="plainTextBindings")
    def plain_text_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptPlainTextBindingArgs']]]]:
        return pulumi.get(self, "plain_text_bindings")

    @plain_text_bindings.setter
    def plain_text_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptPlainTextBindingArgs']]]]):
        pulumi.set(self, "plain_text_bindings", value)

    @property
    @pulumi.getter(name="queueBindings")
    def queue_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptQueueBindingArgs']]]]:
        return pulumi.get(self, "queue_bindings")

    @queue_bindings.setter
    def queue_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptQueueBindingArgs']]]]):
        pulumi.set(self, "queue_bindings", value)

    @property
    @pulumi.getter(name="r2BucketBindings")
    def r2_bucket_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptR2BucketBindingArgs']]]]:
        return pulumi.get(self, "r2_bucket_bindings")

    @r2_bucket_bindings.setter
    def r2_bucket_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptR2BucketBindingArgs']]]]):
        pulumi.set(self, "r2_bucket_bindings", value)

    @property
    @pulumi.getter(name="secretTextBindings")
    def secret_text_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptSecretTextBindingArgs']]]]:
        return pulumi.get(self, "secret_text_bindings")

    @secret_text_bindings.setter
    def secret_text_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptSecretTextBindingArgs']]]]):
        pulumi.set(self, "secret_text_bindings", value)

    @property
    @pulumi.getter(name="serviceBindings")
    def service_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptServiceBindingArgs']]]]:
        return pulumi.get(self, "service_bindings")

    @service_bindings.setter
    def service_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptServiceBindingArgs']]]]):
        pulumi.set(self, "service_bindings", value)

    @property
    @pulumi.getter(name="webassemblyBindings")
    def webassembly_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptWebassemblyBindingArgs']]]]:
        return pulumi.get(self, "webassembly_bindings")

    @webassembly_bindings.setter
    def webassembly_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptWebassemblyBindingArgs']]]]):
        pulumi.set(self, "webassembly_bindings", value)


@pulumi.input_type
class _WorkerScriptState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 analytics_engine_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptAnalyticsEngineBindingArgs']]]] = None,
                 compatibility_date: Optional[pulumi.Input[str]] = None,
                 compatibility_flags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 kv_namespace_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptKvNamespaceBindingArgs']]]] = None,
                 logpush: Optional[pulumi.Input[bool]] = None,
                 module: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 plain_text_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptPlainTextBindingArgs']]]] = None,
                 queue_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptQueueBindingArgs']]]] = None,
                 r2_bucket_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptR2BucketBindingArgs']]]] = None,
                 secret_text_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptSecretTextBindingArgs']]]] = None,
                 service_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptServiceBindingArgs']]]] = None,
                 webassembly_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptWebassemblyBindingArgs']]]] = None):
        """
        Input properties used for looking up and filtering WorkerScript resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] compatibility_date: The date to use for the compatibility flag.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] compatibility_flags: Compatibility flags used for Worker Scripts.
        :param pulumi.Input[str] content: The script content.
        :param pulumi.Input[bool] logpush: Enabling allows Worker events to be sent to a defined Logpush destination.
        :param pulumi.Input[bool] module: The base64 encoded wasm module you want to store.
        :param pulumi.Input[str] name: The global variable for the binding in your Worker code.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if analytics_engine_bindings is not None:
            pulumi.set(__self__, "analytics_engine_bindings", analytics_engine_bindings)
        if compatibility_date is not None:
            pulumi.set(__self__, "compatibility_date", compatibility_date)
        if compatibility_flags is not None:
            pulumi.set(__self__, "compatibility_flags", compatibility_flags)
        if content is not None:
            pulumi.set(__self__, "content", content)
        if kv_namespace_bindings is not None:
            pulumi.set(__self__, "kv_namespace_bindings", kv_namespace_bindings)
        if logpush is not None:
            pulumi.set(__self__, "logpush", logpush)
        if module is not None:
            pulumi.set(__self__, "module", module)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if plain_text_bindings is not None:
            pulumi.set(__self__, "plain_text_bindings", plain_text_bindings)
        if queue_bindings is not None:
            pulumi.set(__self__, "queue_bindings", queue_bindings)
        if r2_bucket_bindings is not None:
            pulumi.set(__self__, "r2_bucket_bindings", r2_bucket_bindings)
        if secret_text_bindings is not None:
            pulumi.set(__self__, "secret_text_bindings", secret_text_bindings)
        if service_bindings is not None:
            pulumi.set(__self__, "service_bindings", service_bindings)
        if webassembly_bindings is not None:
            pulumi.set(__self__, "webassembly_bindings", webassembly_bindings)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="analyticsEngineBindings")
    def analytics_engine_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptAnalyticsEngineBindingArgs']]]]:
        return pulumi.get(self, "analytics_engine_bindings")

    @analytics_engine_bindings.setter
    def analytics_engine_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptAnalyticsEngineBindingArgs']]]]):
        pulumi.set(self, "analytics_engine_bindings", value)

    @property
    @pulumi.getter(name="compatibilityDate")
    def compatibility_date(self) -> Optional[pulumi.Input[str]]:
        """
        The date to use for the compatibility flag.
        """
        return pulumi.get(self, "compatibility_date")

    @compatibility_date.setter
    def compatibility_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "compatibility_date", value)

    @property
    @pulumi.getter(name="compatibilityFlags")
    def compatibility_flags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Compatibility flags used for Worker Scripts.
        """
        return pulumi.get(self, "compatibility_flags")

    @compatibility_flags.setter
    def compatibility_flags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "compatibility_flags", value)

    @property
    @pulumi.getter
    def content(self) -> Optional[pulumi.Input[str]]:
        """
        The script content.
        """
        return pulumi.get(self, "content")

    @content.setter
    def content(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content", value)

    @property
    @pulumi.getter(name="kvNamespaceBindings")
    def kv_namespace_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptKvNamespaceBindingArgs']]]]:
        return pulumi.get(self, "kv_namespace_bindings")

    @kv_namespace_bindings.setter
    def kv_namespace_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptKvNamespaceBindingArgs']]]]):
        pulumi.set(self, "kv_namespace_bindings", value)

    @property
    @pulumi.getter
    def logpush(self) -> Optional[pulumi.Input[bool]]:
        """
        Enabling allows Worker events to be sent to a defined Logpush destination.
        """
        return pulumi.get(self, "logpush")

    @logpush.setter
    def logpush(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "logpush", value)

    @property
    @pulumi.getter
    def module(self) -> Optional[pulumi.Input[bool]]:
        """
        The base64 encoded wasm module you want to store.
        """
        return pulumi.get(self, "module")

    @module.setter
    def module(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "module", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The global variable for the binding in your Worker code.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="plainTextBindings")
    def plain_text_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptPlainTextBindingArgs']]]]:
        return pulumi.get(self, "plain_text_bindings")

    @plain_text_bindings.setter
    def plain_text_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptPlainTextBindingArgs']]]]):
        pulumi.set(self, "plain_text_bindings", value)

    @property
    @pulumi.getter(name="queueBindings")
    def queue_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptQueueBindingArgs']]]]:
        return pulumi.get(self, "queue_bindings")

    @queue_bindings.setter
    def queue_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptQueueBindingArgs']]]]):
        pulumi.set(self, "queue_bindings", value)

    @property
    @pulumi.getter(name="r2BucketBindings")
    def r2_bucket_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptR2BucketBindingArgs']]]]:
        return pulumi.get(self, "r2_bucket_bindings")

    @r2_bucket_bindings.setter
    def r2_bucket_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptR2BucketBindingArgs']]]]):
        pulumi.set(self, "r2_bucket_bindings", value)

    @property
    @pulumi.getter(name="secretTextBindings")
    def secret_text_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptSecretTextBindingArgs']]]]:
        return pulumi.get(self, "secret_text_bindings")

    @secret_text_bindings.setter
    def secret_text_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptSecretTextBindingArgs']]]]):
        pulumi.set(self, "secret_text_bindings", value)

    @property
    @pulumi.getter(name="serviceBindings")
    def service_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptServiceBindingArgs']]]]:
        return pulumi.get(self, "service_bindings")

    @service_bindings.setter
    def service_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptServiceBindingArgs']]]]):
        pulumi.set(self, "service_bindings", value)

    @property
    @pulumi.getter(name="webassemblyBindings")
    def webassembly_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptWebassemblyBindingArgs']]]]:
        return pulumi.get(self, "webassembly_bindings")

    @webassembly_bindings.setter
    def webassembly_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptWebassemblyBindingArgs']]]]):
        pulumi.set(self, "webassembly_bindings", value)


class WorkerScript(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 analytics_engine_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptAnalyticsEngineBindingArgs']]]]] = None,
                 compatibility_date: Optional[pulumi.Input[str]] = None,
                 compatibility_flags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 kv_namespace_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptKvNamespaceBindingArgs']]]]] = None,
                 logpush: Optional[pulumi.Input[bool]] = None,
                 module: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 plain_text_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptPlainTextBindingArgs']]]]] = None,
                 queue_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptQueueBindingArgs']]]]] = None,
                 r2_bucket_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptR2BucketBindingArgs']]]]] = None,
                 secret_text_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptSecretTextBindingArgs']]]]] = None,
                 service_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptServiceBindingArgs']]]]] = None,
                 webassembly_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptWebassemblyBindingArgs']]]]] = None,
                 __props__=None):
        """
        Provides a Cloudflare worker script resource. In order for a script to be active, you'll also need to setup a `WorkerRoute`.

        ## Example Usage

        ```python
        import pulumi
        import base64
        import pulumi_cloudflare as cloudflare

        my_namespace = cloudflare.WorkersKvNamespace("myNamespace",
            account_id="f037e56e89293a057740de681ac9abbe",
            title="example")
        # Sets the script with the name "script_1"
        my_script = cloudflare.WorkerScript("myScript",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="script_1",
            content=(lambda path: open(path).read())("script.js"),
            kv_namespace_bindings=[cloudflare.WorkerScriptKvNamespaceBindingArgs(
                name="MY_EXAMPLE_KV_NAMESPACE",
                namespace_id=my_namespace.id,
            )],
            plain_text_bindings=[cloudflare.WorkerScriptPlainTextBindingArgs(
                name="MY_EXAMPLE_PLAIN_TEXT",
                text="foobar",
            )],
            secret_text_bindings=[cloudflare.WorkerScriptSecretTextBindingArgs(
                name="MY_EXAMPLE_SECRET_TEXT",
                text=var["secret_foo_value"],
            )],
            webassembly_bindings=[cloudflare.WorkerScriptWebassemblyBindingArgs(
                name="MY_EXAMPLE_WASM",
                module=(lambda path: base64.b64encode(open(path).read().encode()).decode())("example.wasm"),
            )],
            service_bindings=[cloudflare.WorkerScriptServiceBindingArgs(
                name="MY_SERVICE_BINDING",
                service="MY_SERVICE",
                environment="production",
            )],
            r2_bucket_bindings=[cloudflare.WorkerScriptR2BucketBindingArgs(
                name="MY_BUCKET",
                bucket_name="MY_BUCKET_NAME",
            )],
            analytics_engine_bindings=[cloudflare.WorkerScriptAnalyticsEngineBindingArgs(
                name="MY_DATASET",
                dataset="dataset1",
            )])
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/workerScript:WorkerScript example <account_id>/<script_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] compatibility_date: The date to use for the compatibility flag.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] compatibility_flags: Compatibility flags used for Worker Scripts.
        :param pulumi.Input[str] content: The script content.
        :param pulumi.Input[bool] logpush: Enabling allows Worker events to be sent to a defined Logpush destination.
        :param pulumi.Input[bool] module: The base64 encoded wasm module you want to store.
        :param pulumi.Input[str] name: The global variable for the binding in your Worker code.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WorkerScriptArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare worker script resource. In order for a script to be active, you'll also need to setup a `WorkerRoute`.

        ## Example Usage

        ```python
        import pulumi
        import base64
        import pulumi_cloudflare as cloudflare

        my_namespace = cloudflare.WorkersKvNamespace("myNamespace",
            account_id="f037e56e89293a057740de681ac9abbe",
            title="example")
        # Sets the script with the name "script_1"
        my_script = cloudflare.WorkerScript("myScript",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="script_1",
            content=(lambda path: open(path).read())("script.js"),
            kv_namespace_bindings=[cloudflare.WorkerScriptKvNamespaceBindingArgs(
                name="MY_EXAMPLE_KV_NAMESPACE",
                namespace_id=my_namespace.id,
            )],
            plain_text_bindings=[cloudflare.WorkerScriptPlainTextBindingArgs(
                name="MY_EXAMPLE_PLAIN_TEXT",
                text="foobar",
            )],
            secret_text_bindings=[cloudflare.WorkerScriptSecretTextBindingArgs(
                name="MY_EXAMPLE_SECRET_TEXT",
                text=var["secret_foo_value"],
            )],
            webassembly_bindings=[cloudflare.WorkerScriptWebassemblyBindingArgs(
                name="MY_EXAMPLE_WASM",
                module=(lambda path: base64.b64encode(open(path).read().encode()).decode())("example.wasm"),
            )],
            service_bindings=[cloudflare.WorkerScriptServiceBindingArgs(
                name="MY_SERVICE_BINDING",
                service="MY_SERVICE",
                environment="production",
            )],
            r2_bucket_bindings=[cloudflare.WorkerScriptR2BucketBindingArgs(
                name="MY_BUCKET",
                bucket_name="MY_BUCKET_NAME",
            )],
            analytics_engine_bindings=[cloudflare.WorkerScriptAnalyticsEngineBindingArgs(
                name="MY_DATASET",
                dataset="dataset1",
            )])
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/workerScript:WorkerScript example <account_id>/<script_name>
        ```

        :param str resource_name: The name of the resource.
        :param WorkerScriptArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WorkerScriptArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 analytics_engine_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptAnalyticsEngineBindingArgs']]]]] = None,
                 compatibility_date: Optional[pulumi.Input[str]] = None,
                 compatibility_flags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 kv_namespace_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptKvNamespaceBindingArgs']]]]] = None,
                 logpush: Optional[pulumi.Input[bool]] = None,
                 module: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 plain_text_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptPlainTextBindingArgs']]]]] = None,
                 queue_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptQueueBindingArgs']]]]] = None,
                 r2_bucket_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptR2BucketBindingArgs']]]]] = None,
                 secret_text_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptSecretTextBindingArgs']]]]] = None,
                 service_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptServiceBindingArgs']]]]] = None,
                 webassembly_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptWebassemblyBindingArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WorkerScriptArgs.__new__(WorkerScriptArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["analytics_engine_bindings"] = analytics_engine_bindings
            __props__.__dict__["compatibility_date"] = compatibility_date
            __props__.__dict__["compatibility_flags"] = compatibility_flags
            if content is None and not opts.urn:
                raise TypeError("Missing required property 'content'")
            __props__.__dict__["content"] = content
            __props__.__dict__["kv_namespace_bindings"] = kv_namespace_bindings
            __props__.__dict__["logpush"] = logpush
            __props__.__dict__["module"] = module
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["plain_text_bindings"] = plain_text_bindings
            __props__.__dict__["queue_bindings"] = queue_bindings
            __props__.__dict__["r2_bucket_bindings"] = r2_bucket_bindings
            __props__.__dict__["secret_text_bindings"] = secret_text_bindings
            __props__.__dict__["service_bindings"] = service_bindings
            __props__.__dict__["webassembly_bindings"] = webassembly_bindings
        super(WorkerScript, __self__).__init__(
            'cloudflare:index/workerScript:WorkerScript',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            analytics_engine_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptAnalyticsEngineBindingArgs']]]]] = None,
            compatibility_date: Optional[pulumi.Input[str]] = None,
            compatibility_flags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            content: Optional[pulumi.Input[str]] = None,
            kv_namespace_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptKvNamespaceBindingArgs']]]]] = None,
            logpush: Optional[pulumi.Input[bool]] = None,
            module: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            plain_text_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptPlainTextBindingArgs']]]]] = None,
            queue_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptQueueBindingArgs']]]]] = None,
            r2_bucket_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptR2BucketBindingArgs']]]]] = None,
            secret_text_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptSecretTextBindingArgs']]]]] = None,
            service_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptServiceBindingArgs']]]]] = None,
            webassembly_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptWebassemblyBindingArgs']]]]] = None) -> 'WorkerScript':
        """
        Get an existing WorkerScript resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] compatibility_date: The date to use for the compatibility flag.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] compatibility_flags: Compatibility flags used for Worker Scripts.
        :param pulumi.Input[str] content: The script content.
        :param pulumi.Input[bool] logpush: Enabling allows Worker events to be sent to a defined Logpush destination.
        :param pulumi.Input[bool] module: The base64 encoded wasm module you want to store.
        :param pulumi.Input[str] name: The global variable for the binding in your Worker code.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WorkerScriptState.__new__(_WorkerScriptState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["analytics_engine_bindings"] = analytics_engine_bindings
        __props__.__dict__["compatibility_date"] = compatibility_date
        __props__.__dict__["compatibility_flags"] = compatibility_flags
        __props__.__dict__["content"] = content
        __props__.__dict__["kv_namespace_bindings"] = kv_namespace_bindings
        __props__.__dict__["logpush"] = logpush
        __props__.__dict__["module"] = module
        __props__.__dict__["name"] = name
        __props__.__dict__["plain_text_bindings"] = plain_text_bindings
        __props__.__dict__["queue_bindings"] = queue_bindings
        __props__.__dict__["r2_bucket_bindings"] = r2_bucket_bindings
        __props__.__dict__["secret_text_bindings"] = secret_text_bindings
        __props__.__dict__["service_bindings"] = service_bindings
        __props__.__dict__["webassembly_bindings"] = webassembly_bindings
        return WorkerScript(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="analyticsEngineBindings")
    def analytics_engine_bindings(self) -> pulumi.Output[Optional[Sequence['outputs.WorkerScriptAnalyticsEngineBinding']]]:
        return pulumi.get(self, "analytics_engine_bindings")

    @property
    @pulumi.getter(name="compatibilityDate")
    def compatibility_date(self) -> pulumi.Output[Optional[str]]:
        """
        The date to use for the compatibility flag.
        """
        return pulumi.get(self, "compatibility_date")

    @property
    @pulumi.getter(name="compatibilityFlags")
    def compatibility_flags(self) -> pulumi.Output[Sequence[str]]:
        """
        Compatibility flags used for Worker Scripts.
        """
        return pulumi.get(self, "compatibility_flags")

    @property
    @pulumi.getter
    def content(self) -> pulumi.Output[str]:
        """
        The script content.
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter(name="kvNamespaceBindings")
    def kv_namespace_bindings(self) -> pulumi.Output[Optional[Sequence['outputs.WorkerScriptKvNamespaceBinding']]]:
        return pulumi.get(self, "kv_namespace_bindings")

    @property
    @pulumi.getter
    def logpush(self) -> pulumi.Output[Optional[bool]]:
        """
        Enabling allows Worker events to be sent to a defined Logpush destination.
        """
        return pulumi.get(self, "logpush")

    @property
    @pulumi.getter
    def module(self) -> pulumi.Output[Optional[bool]]:
        """
        The base64 encoded wasm module you want to store.
        """
        return pulumi.get(self, "module")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The global variable for the binding in your Worker code.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="plainTextBindings")
    def plain_text_bindings(self) -> pulumi.Output[Optional[Sequence['outputs.WorkerScriptPlainTextBinding']]]:
        return pulumi.get(self, "plain_text_bindings")

    @property
    @pulumi.getter(name="queueBindings")
    def queue_bindings(self) -> pulumi.Output[Optional[Sequence['outputs.WorkerScriptQueueBinding']]]:
        return pulumi.get(self, "queue_bindings")

    @property
    @pulumi.getter(name="r2BucketBindings")
    def r2_bucket_bindings(self) -> pulumi.Output[Optional[Sequence['outputs.WorkerScriptR2BucketBinding']]]:
        return pulumi.get(self, "r2_bucket_bindings")

    @property
    @pulumi.getter(name="secretTextBindings")
    def secret_text_bindings(self) -> pulumi.Output[Optional[Sequence['outputs.WorkerScriptSecretTextBinding']]]:
        return pulumi.get(self, "secret_text_bindings")

    @property
    @pulumi.getter(name="serviceBindings")
    def service_bindings(self) -> pulumi.Output[Optional[Sequence['outputs.WorkerScriptServiceBinding']]]:
        return pulumi.get(self, "service_bindings")

    @property
    @pulumi.getter(name="webassemblyBindings")
    def webassembly_bindings(self) -> pulumi.Output[Optional[Sequence['outputs.WorkerScriptWebassemblyBinding']]]:
        return pulumi.get(self, "webassembly_bindings")

